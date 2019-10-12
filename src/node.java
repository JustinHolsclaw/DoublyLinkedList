public class node {

    public node(){

    }

    node head;
    node nextnode = null;
    int data = 0;
    node prevNode = null;

    public int getData(){
        return data;
    }

    public void setData(int userinput) {
        data = userinput;
    }

    public int append(node incomingNode) {
        if(prevNode == null){
            prevNode = incomingNode;
        }
        else{
            prevNode.append(incomingNode);
        }
        return 0;
    }

    public int length() {

        return 2;
    }
}
