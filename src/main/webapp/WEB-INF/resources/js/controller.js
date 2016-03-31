/**
 * Created by cicctusers on 3/1/2016.
 */

var cartApp = angular.module ("cartApp", [])
cartApp.controller("cartCtrl", function ($scope, $http) {
    $scope.refreshCart = function (cartId) {
        $http.get('/eshop/rest/cart/' + $scope.cartId).success(function (data) {
            $scope.cart = data;
        });
    };

    $scope.clearCart = function () {
        $http.delete('/eshop/rest/cart/' + $scope.cartId).success($scope.refreshCart($scope.cartId));
    };

    $scope.initCartId = function (cartId) {
        $scope.cartId = cartId;
        $scope.refreshCart(cartId);
    };

    $scope.addToCart = function (productId) {
        $http.put('/eshop/rest/cart/add/' + productId).success(function (data) {
            $scope.refreshCart($http.get('/eshop/rest/cart/cartId'));
            alert("Product Successfully added to the cart!")
        });
    };

    $scope.removeFromCart = function (productId) {
        $http.put('/eshop/rest/cart/remove/' + productId).success(function (data) {
            $scope.refreshCart(($http.get('/eshop/rest/cart/cartId')));
        });
    };
});