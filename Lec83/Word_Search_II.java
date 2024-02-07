package Lec83;

import java.util.*;

public class Word_Search_II {
	static class Node {
		char data;
		String isTerminal = null;
		HashMap<Character, Node> child = new HashMap<>();
	}

	public static void insert(Node root, String word) {
		Node curr = root;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (curr.child.containsKey(ch)) {
				curr = curr.child.get(ch);
			} else {
				Node nn = new Node();
				nn.data = ch;
				curr.child.put(ch, nn);
				curr = nn;
			}
		}
		curr.isTerminal = word;

	}

	public static void main(String[] args) {
		char[][] board = { { 'o', 'a', 'a', 'n' }, { 'e', 't', 'a', 'e' }, { 'i', 'h', 'k', 'r' },
				{ 'i', 'f', 'l', 'v' } };

		String[] words = { "oath", "pea", "eat", "rain" };
		Node root = new Node();
		for (String s : words) {
			insert(root, s);
		}
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (root.child.containsKey(board[i][j])) {
					wordsearch(board, i, j, root);
				}
			}
		}
		System.out.println(ll);
	}

	static List<String> ll = new ArrayList<>();

	private static void wordsearch(char[][] board, int r, int c, Node root) {
		// TODO Auto-generated method stub
		if (r < 0 || c < 0 || r >= board.length ||
				c >= board[0].length || !root.child.containsKey(board[r][c])) {
			return;
		}
		char ch = board[r][c];
		Node curr=root.child.get(ch);
		if(curr.isTerminal!=null) {
			ll.add(curr.isTerminal);
			curr.isTerminal=null;
		}
		board[r][c]='*';
		wordsearch(board, r + 1, c, curr);
		wordsearch(board, r - 1, c, curr);
		wordsearch(board, r, c + 1, curr);
		wordsearch(board, r, c - 1, curr);
		board[r][c]=ch;
	}

}
