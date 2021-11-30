package org.jgrapht.alg.interfaces;

import java.util.*;

import org.jgrapht.*;
import org.jgrapht.util.*;

public interface EdgeGraphKernelsAlgorithm<V,E,L>
{
   
    class Labels{
        
        
        
        
    }
    
    default double kernel(Graph<V,E> g1, Map<E,L> labels1, Graph<V,E> g2, Map<E,L> labels2) {
        
        double x = 0;
        int El1,El2;
        Map<E,L> edgeLabels1 = new HashMap<E,L>();
        Map<E,L> edgeLabels2 = new HashMap<E,L>();
       
        for(E e:g1.edgeSet()) {
             El1 =  (int) edgeLabels1.get(e);
        }
        
        for(E e:g2.edgeSet()) {
            El2 =  (int) edgeLabels2.get(e);
       }
        
        return x;
    }

    
    
    
    
    //VertexToIntegerMapping<V1> getVertexToIntegerMapping(Graph<V1, E1> graph1);
    
    
    
    //VertexToIntegerMapping<V2> getVertexToIntegerMapping(Graph<V2, E2> graph2);
}
