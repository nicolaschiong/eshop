package com.eshop.dao.impl;

import com.eshop.dao.CartDao;
import com.eshop.model.Cart;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by cicctusers on 2/29/2016.
 */
@Repository
public class CartDaoImpl implements CartDao {

    private Map<String, Cart> listofCarts;

    public CartDaoImpl() {
        listofCarts = new HashMap<String, Cart>();
    }

    public Cart create(Cart cart) {
        if (listofCarts.keySet().contains(cart.getCartId())) {
            throw new IllegalArgumentException(String.format("Cannot create a cart. A cart with the given id #(%) already exists.", cart.getCartId()));
        }
        listofCarts.put(cart.getCartId(), cart);
        return cart;
    }

    public Cart read(String cartId) {
        return listofCarts.get(cartId);
    }

    public void update(String cartId, Cart cart) {
        if (!listofCarts.keySet().contains(cartId)) {
            throw new IllegalArgumentException(String.format("Cannot update cart. A cart with the given id #(%) does not exist.", cart.getCartId()));
        }
        listofCarts.put(cartId, cart);
    }

    public void delete(String cartId) {
        if (!listofCarts.keySet().contains(cartId)) {
            throw new IllegalArgumentException(String.format("Cannot delete cart. A cart with the given id #(%) does not exist.", cartId));
        }
        listofCarts.remove(cartId);
    }
}
