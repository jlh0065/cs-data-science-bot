import java.io.*;

public class TesterDataScienceBot {
	public static void main(String[] args) {
		
		DataScienceBotReader myreader =  new DataScienceBotReader();
		myreader.readRedditFileForPositive("redditPosts.txt");
		myreader.readRedditFileForNegative("redditPosts.txt");
	}
}