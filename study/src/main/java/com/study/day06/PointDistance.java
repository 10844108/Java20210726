package com.study.day06;

import java.security.PublicKey;

public class PointDistance {
	private double distance;
	private Point p1;
	private Point p2;
	public PointDistance(Point p1, Point p2) {
		super();
		this.p1 = p1;
		this.p2 = p2;
		calcDistance();
	}
	private void calcDistance() {
		double d=0;
		double x1x2=Math.pow(p1.getX() -p2.getX(), 2);
		double y1y2=Math.pow(p1.getY()- p2.getY() , 2);
		d=Math.sqrt(x1x2+y1y2);
		this.distance=d;
	}
	@Override
	public String toString() {
		return "PointDistance [p1=" + p1 + ", p2=" + p2 + "]";
	}
	public double getDistance() {
		return distance;
	}
}
