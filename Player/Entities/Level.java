package Entities;
import Entities.Star;
import Entities.Word;

import java.util.Dictionary;

import Entities.Board;

public class Level {
	final int TOTAL_NUM_TILES = 6;
	String path;
	Board board;
	Star star;
	int highScore;
	Logic logic;
	Dictionary dictionary;

	public Level(String path) {
		this.path = path;
		this.board = new Board(new char[TOTAL_NUM_TILES][TOTAL_NUM_TILES]);
	}
	
	public boolean saveHighScore(int score){
		boolean scoreHighest;
		if(score > highScore){
			scoreHighest = true;
			this.highScore = score;
		}
		else{
			scoreHighest = false;
		}
		
		return scoreHighest;
	}
	public boolean initialize(){
		return false;
	}
	public boolean initializeView(){
		return false;
	}
	public boolean initializeControllers(){
		return false;
	}
	public void reconstruct(){
		return;
	}
	
	// Getters and Setters //
	public Board getBoard() { return board; }
	public Star getStar() { return star; }
	public int getHighScore() { return highScore; }
	public Logic getLogic() { return logic; }
	public Dictionary getDictionary() { return dictionary; }
}
