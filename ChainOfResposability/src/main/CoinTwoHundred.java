/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author orlag_nzyjv2m
 */
class CoinTwoHundred implements Handler {
    private Handler nextHandler;

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handle(int amount) {
        int numCoins = amount / 200;
        int remainder = amount % 200;
        if (numCoins > 0) {
            System.out.println("Dispensing " + numCoins + " Coin Two hundred.");
        }
        if (remainder > 0 && nextHandler != null) {
            nextHandler.handle(remainder);
        }
    }
}
