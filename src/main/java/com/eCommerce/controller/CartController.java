package com.eCommerce.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eCommerce.entity.CartItem;

@RestController
@RequestMapping("/api/cart")
@CrossOrigin
public class CartController {

    private List<CartItem> cart = new ArrayList<>();

    @PostMapping
    public List<CartItem> addToCart(@RequestBody CartItem item) {
        cart.add(item);
        return cart;
    }

    @GetMapping
    public List<CartItem> getCart() {
        return cart;
    }
}
