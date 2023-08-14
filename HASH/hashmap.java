importjava.util.*;
public class hashmap{
    static class HashMap<k,v>{  //generics(parametarized types)
        private class Node{
            k key;
            v value;

            public Node(k key,v value){
                this.key=key;
                this.value=value;
            }
        }

        private int n; //n-nodes
        private int N; //N-buckets
        private LinkedList<Node>buckets[]; //N=buckets.length

        public HashMap(){
            this.N=4;
            this.buckets=new LinkedList[4];
            for(int i=0;i<4;i++){
                this.buckets[i]=new LinkedList<>();
            }
        }
         int bi= hashfunction(k key);

        public void put(k key,v value){
            int bi= hashfunction(key);
            int di=searchinLinkedList(key,bi);// data index
            //finde out dataindex i.e;linkedlist index
            //di=-1
            if(di==-1){//key doesn't exist
                buckets[i].add(new Node(key,value));
                n++;
            }
            else{//key exist
                Node data=buckets[bi].get(di);
                data.value=value;
            }

                double lambda=(double)n/N;
                if(lambda>2.0){
                    //rehashing
                }

        }   






    }
}