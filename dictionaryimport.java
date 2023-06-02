package pkg;
import java.util.*;
import java.io.*;
public class Dictionary{
public void Sort() throws Exception {
    File text = new File("./dictionary.txt");
    Scanner numLines = new Scanner(text);
    Scanner sc = new Scanner(text);
    
    int count = 0;
    while(numLines.hasNextLine()){
        numLines.nextLine();
        count++;
    }
    
    String [] dictionary = new String[count];
    
    int i = 0;
    while(sc.hasNextLine()){
    dictionary[i] = line;
    i++;
    }
}
public void constructWordArray(){
    int randomIndex = (int)(Math.random()*dictionary.length;
    String word = dictionary[randomIndex];
    String [] actWord = new String[word.length];
    for(int i = 0; i<word.length; i++){
        actWord [i] = word.Substring(i, i+1);
    }
    
}
public String[] returnWordArray(){
    return actWord[];
}

public String[] bufferWord(String temp){
    String [] buffer = new String[word.length];
    for(int j = 0; j < word.length; j++){
        buffer[j] = " * ";
    }
    return buffer[];
}
}