
class single_linklist {
    
    class linknode
    {
        private int data;
        private linknode next;
        public linknode(int data)
        {
           this.data = data;
           this.next = null;
        }
    }

    public linknode heads = null; 
    public linknode tail = null;
    void addnode(int data)
    {
        linknode newnode = new linknode(data);

        if(heads == null)
        {
            heads = newnode;
            tail = newnode;
        }
        else
        {
            tail.next = newnode;
            tail = newnode;
        }


    }

    void insertafter(int data, int j)
    {
        linknode newnodes = new linknode(data);
        linknode currents = heads;
        while(currents.data != j)
        {
            currents = currents.next;
        }
        
        linknode dd = currents.next;
    
        newnodes.next = dd;
        currents.next = newnodes;

    }

    void delete()
    {
        linknode dele = tail;
        if(heads == tail)
        {
            heads = null;
        }
        else
        {
            linknode cur = heads;
            while(cur.next != tail)
            {
                cur = cur.next;
            }

            tail = cur;
            tail.next = null;
        }
    }


    void printlist()
    {
        
        while(tail.next == null)
        {
            System.out.println(heads.data);
            heads = heads.next;

        }
    }
    
    
    public static void main(String[] args) {
        
        
        single_linklist sss = new single_linklist();
        sss.addnode(100);
        sss.addnode(10);
        sss.addnode(15);
        sss.addnode(1);
        sss.addnode(100);
        sss.addnode(22);
        sss.addnode(36);
        sss.insertafter(89,1); 
        sss.delete();
        sss.printlist();
          
    }
}