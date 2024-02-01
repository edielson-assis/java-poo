package entities;

import java.util.HashSet;
import java.util.Set;

public class Course {

    private Integer A;
    private Integer B;
    private Integer C;

    private Set<Integer> set = new HashSet<>();

    public Course() {

    }

    public Course(Integer a, Integer b, Integer c) {
        A = a;
        B = b;
        C = c;
    }

    public Integer getA() {
        return A;
    }

    public void addA(Integer a) {
        set.add(a);
    }

    public Integer getB() {
        return B;
    }

    public void addB(Integer b) {
        set.add(b);
    }

    public Integer getC() {
        return C;
    }

    public void addC(Integer c) {
        set.add(c);
    }
    
    public Set<Integer> getSet() {
        return set;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((A == null) ? 0 : A.hashCode());
        result = prime * result + ((B == null) ? 0 : B.hashCode());
        result = prime * result + ((C == null) ? 0 : C.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Course other = (Course) obj;
        if (A == null) {
            if (other.A != null)
                return false;
        } else if (!A.equals(other.A))
            return false;
        if (B == null) {
            if (other.B != null)
                return false;
        } else if (!B.equals(other.B))
            return false;
        if (C == null) {
            if (other.C != null)
                return false;
        } else if (!C.equals(other.C))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Total students: " + set.size();
    }    
}