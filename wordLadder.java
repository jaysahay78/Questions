package com.company;

import java.util.*;

class stringPair{
    String first;
    int second;
    stringPair(String _first, int _second){
        this.first = _first;
        this.second = _second;
    }
}

public class wordLadder {
    public int ladderLength(String beginWord, String endWord, List<String> wordList){
        Set<Character> st1 = new HashSet<Character>();
        List<Character> result = new LinkedList<>();
        int j = 0;
        for (String it : wordList){
            for (int i = 0; i<it.length(); i++){
                char letter = it.charAt(i);
                if (!st1.contains(letter)){
                    st1.add(letter);
                    result.add(letter);
                }
            }
        }
        Queue<stringPair> q = new LinkedList<>();
        q.add(new stringPair(beginWord, 1));
        Set<String> st = new HashSet<>(wordList);
        st.remove(beginWord);
        while(!q.isEmpty()){
            String word = q.peek().first;
            int steps = q.peek().second;
            q.remove();
            if (word.equals(endWord)){return steps;}
            for (int i = 0; i<word.length(); i++){
                for (Character it : result){
                    char[] replacedArray = word.toCharArray();
                    replacedArray[i] = it;
                    String replacedWord = new String(replacedArray);
                    if (st.contains(replacedWord)){
                        st.remove(replacedWord);
                        q.add(new stringPair(replacedWord, steps +1));
                    }
                }
            }
        }
        return 0;
    }
}
