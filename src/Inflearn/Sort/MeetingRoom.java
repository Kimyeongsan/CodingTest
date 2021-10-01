package Inflearn.Sort;

import java.util.*;

// 미팅룸1 문제
public class MeetingRoom {

	public boolean solve(int[][] intervals) {

		if (intervals == null || intervals.length == 0) {
			return true;
		}

		Arrays.sort(intervals, (a, b) -> a[0] - b[0]); // 0 5 16으로 정렬
		
		int end = intervals[0][1];
		System.out.print(end);

		for (int i = 1; i < intervals.length; i++) {
			if (intervals[i][0] < end) {
				return false;
			}
			end = intervals[i][0];
		}
		return true;
	}

	public static void main(String[] args) {
		MeetingRoom a = new MeetingRoom();

//		int[][] intervals = { { 5, 10 }, { 16, 20 }, { 0, 30 } }; // false
		int[][] intervals = {{ 7, 10 }, { 2, 4 }}; // true

		System.out.println(a.solve(intervals));
	}

}