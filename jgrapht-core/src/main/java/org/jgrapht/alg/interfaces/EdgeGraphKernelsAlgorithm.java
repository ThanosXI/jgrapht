/*
 * (C) Copyright 2021-2021, by Athanasios Charatsidis and Contributors.
 *
 * JGraphT : a free Java graph-theory library
 *
 * See the CONTRIBUTORS.md file distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0, or the
 * GNU Lesser General Public License v2.1 or later
 * which is available at
 * http://www.gnu.org/licenses/old-licenses/lgpl-2.1-standalone.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR LGPL-2.1-or-later
 */
package org.jgrapht.alg.interfaces;

import java.util.*;

import org.jgrapht.*;
import org.jgrapht.util.*;

/**
 *  Labeled Edge Graph Kernel
 * 
 * @author Athanasios Charatsidis
 *
 * @param <V> the graph vertex type
 * @param <E> the graph edge type
 * @param <L> the label of each edge
 */

public interface EdgeGraphKernelsAlgorithm<V,E,L>
{
   
   /* class Labels{
        
        
        
        
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

    */
    
    
    
    //VertexToIntegerMapping<V1> getVertexToIntegerMapping(Graph<V1, E1> graph1);
    
    
    
    //VertexToIntegerMapping<V2> getVertexToIntegerMapping(Graph<V2, E2> graph2);
}
