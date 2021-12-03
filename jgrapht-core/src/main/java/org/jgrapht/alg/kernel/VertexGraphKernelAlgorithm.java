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
 * Labeled Vertex Graph Kernel
 * 
 * @author Athanasios Charatsidis
 * 
 * @param <V> the graph vertex type
 * @param <E> the graph edge type
 * @param <L> the label of each vertex
 */

public class VertexGraphKernelAlgorithm<V, L, E>
{

    double kernel(Graph<V, E> g1, Map<V, L> labels1, Graph<V, E> g2, Map<V, L> labels2)
    {

        double x = 0;
        int Vl1, Vl2;

        Map<V, L> vertexLabels1 = new HashMap<V, L>();

        Map<V, L> vertexLabels2 = new HashMap<V, L>();

        for (V v : g1.vertexSet()) {
            Vl1 = (int) vertexLabels1.get(v);
        }

        for (V v : g2.vertexSet()) {
            Vl2 = (int) vertexLabels2.get(v);
        }

        return x;
    }

}
