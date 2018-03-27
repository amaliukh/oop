package com.tasks3.linkedlist;



public class LinkedList {

    

    private Node start;

    private Node end;

    private int size = 0;



    public LinkedList() {



    }



    public void add(Integer data) {

        Node newNode = new Node();

        newNode.setData(data);



        if (size == 0)

            start = newNode;

        else

            end.setNext(newNode);



        end = newNode;

        size++;

    }



    public Integer get(int index) {

        return findNodeByIndex(index).getData();

    }



    public boolean delete(int index) {

        if (findNodeByIndex(index) != null ) {



            if (index != 0)

                findNodeByIndex(index - 1).setNext(findNodeByIndex(index+1));

            else

                start = start.getNext();



            size--;

            return true;

        }

        return false;

    }



    public int size() {

        return size;

    }



    private Node findNodeByIndex(int index) {

        if (index < size && index >= 0) {

            Node curNode = start;

            int curIndex = 0;

            while (curIndex < index){

                if (curNode.getNext() != null) {

                    curNode = curNode.getNext();

                    curIndex++;

                }



            }

            return curNode;

        }

        else

            return null;

    }



}