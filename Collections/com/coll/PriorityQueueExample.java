package com.coll;

import java.util.PriorityQueue;

class Task implements Comparable<Task> {

    String name;
    int priority;

    public Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    @Override
    public int compareTo(Task t) {
        return this.priority - t.priority;   // smaller number = higher priority
    }

    @Override
    public String toString() {
        return name + " (Priority: " + priority + ")";
    }
}


public class PriorityQueueExample {

    public static void main(String[] args) {

        PriorityQueue<Task> pq = new PriorityQueue<>();

        pq.add(new Task("Task 1", 3));
        pq.add(new Task("Task 2", 1));
        pq.add(new Task("Task 3", 5));
        pq.add(new Task("Task 4", 2));

        while(!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}