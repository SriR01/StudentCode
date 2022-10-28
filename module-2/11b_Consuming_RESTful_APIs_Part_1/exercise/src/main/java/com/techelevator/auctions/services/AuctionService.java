package com.techelevator.auctions.services;

import org.springframework.web.client.RestTemplate;

import com.techelevator.auctions.model.Auction;

import javax.swing.*;
import java.util.ArrayList;

public class AuctionService {

    public static String API_BASE_URL = "http://localhost:3000/auctions/";
    private RestTemplate restTemplate = new RestTemplate();


    public Auction[] getAllAuctions() {
        // call api here
        return restTemplate.getForObject(API_BASE_URL,Auction[].class);
    }

    public Auction getAuction(int id) {
        // call api here
        return restTemplate.getForObject(API_BASE_URL + id,Auction.class);
    }

    public Auction[] getAuctionsMatchingTitle(String title) {
        // call api here
        ArrayList<Auction> auctionsTitleMatch = new ArrayList<>();
        Auction[] auctionArray = getAllAuctions();
        for (Auction auction : auctionArray) {
            if (auction.getTitle().equals(title)) {
                auctionsTitleMatch.add(auction);
            }
        }
        Auction[] matchingTitleArray = new Auction[auctionsTitleMatch.size()];
        return auctionsTitleMatch.toArray(matchingTitleArray);
    }

    public Auction[] getAuctionsAtOrBelowPrice(double price) {
        ArrayList<Auction> auctionsTitleMatch = new ArrayList<>();
        Auction[] auctionArray = getAllAuctions();
        for (Auction auction : auctionArray) {
            if (auction.getCurrentBid() <= price) {
                auctionsTitleMatch.add(auction);
            }
        }
        Auction[] auctionPriceArray = new Auction[auctionsTitleMatch.size()];
        return auctionsTitleMatch.toArray(auctionPriceArray);
    }

}
