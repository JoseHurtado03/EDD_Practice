/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prequiz;

public class Function {

    public Function() {
    }
    
    public ListGroup createLists(DoubleList firstList, DoubleList secondList){
        DoubleList union = new DoubleList();
        DoubleList intersection = new DoubleList();
        DoubleList complement = new DoubleList();
        while (!firstList.isEmpty() && !secondList.isEmpty()){
            Nodo nodeUno = firstList.deleteElement(firstList.getHead().getElement());
            Nodo nodeDos = secondList.deleteElement(secondList.searchElement(nodeUno.getElement()));
            union.append(nodeUno.getElement());
            if (nodeDos != null){
                intersection.append(nodeDos.getElement());
            } else{
                complement.append(nodeUno.getElement());
            }
        }
        if (!firstList.isEmpty() && secondList.isEmpty()){
            Nodo pointer = firstList.getHead();
            while (pointer != null){
                union.append(pointer.getElement());
                complement.append(pointer.getElement());
                pointer = pointer.getNext();
            } 
        } else if (firstList.isEmpty() && !secondList.isEmpty()){
            Nodo pointer = secondList.getHead();
            while (pointer != null){
                union.append(pointer.getElement());
                complement.append(pointer.getElement());
                pointer = pointer.getNext();
            }
        }
        return new ListGroup(union, intersection, complement);
    }
}
