/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author orlag_nzyjv2m
 */
class CoinFifty implements Handler {
    private Handler nextHandler;

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handle(int amount) {
        int numCoins = amount / 50;
        int remainder = amount % 50;
        if (numCoins > 0) {
            System.out.println("Dispensing " + numCoins + " Coin Fifty.");
        }
        if (remainder > 0) {
            System.out.println("Cannot dispense exact change, remaining: " + remainder);
        }
    }
}
