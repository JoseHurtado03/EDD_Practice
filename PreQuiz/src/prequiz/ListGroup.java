/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prequiz;

public class ListGroup {
    private DoubleList union;
    private DoubleList intersection;   
    private DoubleList complement;

    public ListGroup(DoubleList union, DoubleList intersection, DoubleList complement) {
        this.union = union;
        this.intersection = intersection;
        this.complement = complement;
    }

    /**
     * @return the union
     */
    public DoubleList getUnion() {
        return union;
    }

    /**
     * @param union the union to set
     */
    public void setUnion(DoubleList union) {
        this.union = union;
    }

    /**
     * @return the intersection
     */
    public DoubleList getIntersection() {
        return intersection;
    }

    /**
     * @param intersection the intersection to set
     */
    public void setIntersection(DoubleList intersection) {
        this.intersection = intersection;
    }

    /**
     * @return the complement
     */
    public DoubleList getComplement() {
        return complement;
    }

    /**
     * @param complement the complement to set
     */
    public void setComplement(DoubleList complement) {
        this.complement = complement;
    }
}
