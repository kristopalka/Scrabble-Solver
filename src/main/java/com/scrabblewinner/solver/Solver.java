package com.scrabblewinner.solver;

import com.scrabblewinner.scrabble.board.StandardBoard;
import com.scrabblewinner.scrabble.holder.StandardHolder;
import com.scrabblewinner.scrabble.board.components.Word;

import java.util.ArrayList;

public class Solver
{
    public static void getBestWords(StandardBoard board, StandardHolder holder, int numberOfWordsToGet)
    {
        ArrayList<Word> possibleWords = WordsFinder.getAll(board, holder);
        //todo calculate points for each word
        //todo sort and return
    }







}