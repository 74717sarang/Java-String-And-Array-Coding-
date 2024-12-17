package com.array;

import java.util.Arrays;

public class ShootPlanes {

//	There is an array which contains the speed at which the ith plane is approaching the ground.
//	At each second only one plane can be shot. How much time will be needed to shoot all the planes. 
//	If shooting is not possible return -1.

	private int shootPlanes(int[] speeds) {
		int time=0;
        Arrays.sort(speeds);
        
		for(int i=0;i<speeds.length;i++) {
			if(time>=speeds[i]) return -1;
			
			time++;
		}
		return time;
	}
	
	
	public static void main(String[] args) {
		ShootPlanes sol = new ShootPlanes();
	        int[] speeds = {2, 1, 3}; // Example input
	        System.out.println(sol.shootPlanes(speeds)); // Output: 3
		
	}



}
