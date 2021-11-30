package org.jgrapht.alg.interfaces;

import java.util.*;

import org.jgrapht.*;
import org.jgrapht.util.*;

public interface VertexGraphKernelsAlgorithm<V,E,L>
{

    
default double kernel(Graph<V,E> g1, Map<V,L> labels1, Graph<V,E> g2, Map<V,L> labels2) {
        
        double x = 0;
        int Vl1,Vl2;
        Map<V,L> vertexLabels1 = new HashMap<V,L>();
        Map<V,L> vertexLabels2 = new HashMap<V,L>();
       
        for(V v:g1.vertexSet()) {
             Vl1 =  (int) vertexLabels1.get(v);
        }
        
        for(V v:g2.vertexSet()) {
            Vl2 =  (int) vertexLabels2.get(v);
       }
        
        return x;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
