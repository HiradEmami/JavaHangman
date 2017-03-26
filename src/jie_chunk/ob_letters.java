/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jie_chunk;

/**
 *
 * @author Hirad Gorgoroth
 */
public class ob_letters {
    private String letter;
    private int number;

    public ob_letters(String letter, int number) {
        this.letter = letter;
        this.number = number;
    }

    public String getLetter() {
        return letter;
    }

    public int getNumber() {
        return number;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }

    public void setNumber(int number) {
        this.number = number;
    }
     public void addNumber() {
        this.number = number++;
    }
    
}
