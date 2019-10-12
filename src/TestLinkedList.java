import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestLinkedList {
    @Test
    public void canSetNode(){
        node newNode = new node();
        newNode.setData(5);
       int result = newNode.getData();
        assertEquals(5, result);
    }

    @Test
    public void canAddNode(){
        node Head = new node();
        Head.append(new node());
        assertEquals(2, Head.length());
    }
    @Test
    public void canAdd2Nodes(){
        node Head = new node();
        Head.append(new node());
        Head.append(new node());
        assertEquals(3, Head.length());
    }
}
