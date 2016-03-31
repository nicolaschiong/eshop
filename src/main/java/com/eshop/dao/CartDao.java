package com.eshop.dao;

import com.eshop.model.Cart;

/**
 * Created by cicctusers on 2/29/2016.
 */
public interface CartDao {

    Cart create(Cart cart);

    Cart read(String cartId);

    void update(String cartId, Cart cart);

    void delete(String cartId);
}
