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
package org.jgrapht.alg.kernel;

import java.util.*;

import org.jgrapht.*;

/**
 * Labeled Edge Graph Kernel
 * 
 * @author Athanasios Charatsidis
 *
 * @param <V> the graph vertex type
 * @param <E> the graph edge type
 * @param <L> the label of each edge
 */

public class EdgeGraphKernelAlgorithm<E, V, L>
{

    double kernel(Graph<V, E> g1, Map<E, L> labels1, Graph<V, E> g2, Map<E, L> labels2)
    {

        double x = 0;
        int El1, El2;

        Map<E, L> edgeLabels1 = new HashMap<E, L>();

        Map<E, L> edgeLabels2 = new HashMap<E, L>();

        for (E e : g1.edgeSet()) {
            El1 = (int) edgeLabels1.get(e);
        }

        for (E e : g2.edgeSet()) {
            El2 = (int) edgeLabels2.get(e);
        }

        return x;
    }

    
    
}
