let allItemsIncomplete = true;
const pageTitle = 'My Shopping List';
const groceries = [
  { id: 1, name: 'Oatmeal', completed: false },
  { id: 2, name: 'Milk', completed: false },
  { id: 3, name: 'Banana', completed: false },
  { id: 4, name: 'Strawberries', completed: false },
  { id: 5, name: 'Lunch Meat', completed: false },
  { id: 6, name: 'Bread', completed: false },
  { id: 7, name: 'Grapes', completed: false },
  { id: 8, name: 'Steak', completed: false },
  { id: 9, name: 'Salad', completed: false },
  { id: 10, name: 'Tea', completed: false }
];

/**
 * This function will get a reference to the title and set its text to the value
 * of the pageTitle variable that was set above.
 */
function setPageTitle() {
  const title = document.getElementById('title');
  title.innerText = pageTitle;
}

/**
 * This function will loop over the array of groceries that was set above and add them to the DOM.
 */
function displayGroceries() {
  const ul = document.querySelector('ul');
  groceries.forEach((item) => {
    const li = document.createElement('li');
    li.innerText = item.name;
    const checkCircle = document.createElement('i');
    checkCircle.setAttribute('class', 'far fa-check-circle');
    li.appendChild(checkCircle);
    ul.appendChild(li);
  });
}

function markAllCompleted() {
 let groceryList = document.querySelectorAll("li");
 let toggleButton = document.getElementById('toggleAll');
  groceryList.forEach((grocery) => {
    grocery.classList.add("completed");
    grocery.setAttribute('completed',true);
  });
  allItemsIncomplete = false;
  toggleButton.innerText = 'Mark All Incomplete';
}

function markAllIncomplete() {
  let groceryList = document.querySelectorAll("li");
  let toggleButton = document.getElementById('toggleAll');
  groceryList.forEach((grocery) => {
    grocery.removeAttribute("class");
    grocery.setAttribute('completed',false);
  }); 
  allItemsIncomplete = true;
  toggleButton.innerText ='Mark All Complete';
}

function markItemComplete(event) {
  event.target.setAttribute('class','completed');
  event.target.setAttribute('completed',true);
}

function markItemIncomplete(event) {
  if (event.target.hasAttribute('class')) {
    event.target.removeAttribute('class');
  }
} 

function toggleAll() {
  if(!allItemsIncomplete) {
    markAllIncomplete();
  } else {
    markAllCompleted();
  }
}

document.addEventListener('DOMContentLoaded', doAfterDOMLoaded);

function doAfterDOMLoaded() {
  displayGroceries();
  setPageTitle();

  let groceryList = document.querySelectorAll('li');
  groceryList.forEach((grocery)=> {
    grocery.addEventListener('click',markItemComplete);
  });

  groceryList.forEach((grocery)=> {
    grocery.addEventListener('dblclick',markItemIncomplete);
  })

  let toggleButton = document.querySelector('a');
  toggleButton.addEventListener('click',toggleAll);

}
