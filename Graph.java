public class Main {
    // Inner class to represent edges
    class Edge {
        int src, dest;
    }

    int vertices, edges;
    Edge[] edge;

    public Main(int vertices, int edges) {
        this.vertices = vertices;
        this.edges = edges;
        edge = new Edge[edges];
        for (int i = 0; i < edges; i++) {
            edge[i] = new Edge();
        }
    }

    public static void main(String[] args) {
        // Create an object of Main
        int noVertices = 10; // Modify to add 5 more vertices
        int noEdges = 13; // Adjust as needed

        Main g = new Main(noVertices, noEdges);

        // Create edges for the original graph
        g.edge[0].src = 1;  //edge 1---2
        g.edge[0].dest = 2;
        g.edge[1].src = 1;   //edge 1---3
        g.edge[1].dest = 3;
        g.edge[2].src = 1;   //edge 1---4
        g.edge[2].dest = 4;
        g.edge[3].src = 2;   //edge 2---4
        g.edge[3].dest = 4;
        g.edge[4].src = 2;   //edge 2---5
        g.edge[4].dest = 5;  
        g.edge[5].src = 3;   //edge 3---4
        g.edge[5].dest = 4;  
        g.edge[6].src = 3;    //edge 3---5
        g.edge[6].dest = 5;
        g.edge[7].src = 4;    //edge 4---5
        g.edge[7].dest = 5;

        // Additional edges for the modified graph
        g.edge[8].src = 6;   //edge 6---7
        g.edge[8].dest = 7;
        g.edge[9].src = 6; //edge 6---8
        g.edge[9].dest = 8;
        g.edge[10].src = 7; //edge 7---9
        g.edge[10].dest = 9;
        g.edge[11].src = 8; //edge 8---9
        g.edge[11].dest = 9;
        g.edge[12].src = 9; //edge 9---10
        g.edge[12].dest = 10;

        // Print graph
        System.out.println("Edges of the graph:");
        for (int i = 0; i < noEdges; i++) {
            System.out.println(g.edge[i].src + " - " + g.edge[i].dest);
        }
    }
}