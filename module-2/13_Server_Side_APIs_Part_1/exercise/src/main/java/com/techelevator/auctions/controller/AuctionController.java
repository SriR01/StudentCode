package com.techelevator.auctions.controller;

import com.techelevator.auctions.dao.AuctionDao;
import com.techelevator.auctions.dao.MemoryAuctionDao;
import com.techelevator.auctions.model.Auction;
import org.jetbrains.annotations.NotNull;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/auctions")
public class AuctionController {

    private AuctionDao dao;

    public AuctionController() {
        this.dao = new MemoryAuctionDao();
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Auction> list(@RequestParam(value = "title_like", defaultValue = "") @NotNull String title,
                              @RequestParam(value = "currentBid_lte", defaultValue = "0") double currentBid){
        if (!title.isEmpty() && currentBid > 0) {
            return dao.searchByTitleAndPrice(title, currentBid);
        } else if (!title.isEmpty()) {
            return dao.searchByTitle(title);
        } else if (currentBid > 0) {
            return dao.searchByPrice(currentBid);
        } else {
            return dao.list();
        }
    }

    @RequestMapping(path ="/{id}", method = RequestMethod.GET)
    public Auction get(@PathVariable int id) {
        Auction auctionWithRequiredID = new Auction();
        auctionWithRequiredID = dao.get(id);
        return auctionWithRequiredID;
    }

    @RequestMapping(method = RequestMethod.POST)
    public Auction create(@RequestBody Auction inputAuction){
        return dao.create(inputAuction);
    }






}
