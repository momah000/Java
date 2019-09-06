/** Implements the interface <code>Stack</code> using linked elements.
 *
 *
 * @author  Marcel Turcotte (turcotte@eecs.uottawa.ca)
 */

public class LinkedStack<E> implements Stack<E> {

    // Objects of the class Elem are used to store the elements of the
    // stack.
    
    private static class Elem<T> {
        private T value;
        private Elem<T> next;

        private Elem(T value, Elem<T> next) {
            this.value = value;
            this.next = next;
        }
    }

    // Reference to the top element
    
    private Elem<E> top;

    //Reference to the bottom element
    private Elem<E> bottom;

    public int swwitch = 0;

    /** Returns <code>true</code> if this stack is empty, and
     * <code>false</code> otherwise.
     *
     * @return <code>true</code> if this stack is empty, and
     * <code>false</code> otherwise.
     */

    public boolean isEmpty() {
        return top == null;
    }

    /** Inserts an element onto the stack.
     *
     * @param value the element to be inserted
     */

    public void push(E value) {

	if (value == null) {
	    throw new NullPointerException();
	}
	
        top = new Elem<E>(value, top);
    }

    /** Returns the top element, without removing it.
     *
     * @return the top element
     */

    public E peek() {

	// pre-condition: the stack is not empty
	
        return top.value;
    }

    /** Removes and returns the top element.
     *
     * @return the top element
     */

    public E pop() {

	// pre-condition: the stack is not empty
	
        E saved = top.value;
        top = top.next;
        return saved;

    }

    /** Removes the top element of the stack. The element inserted at
     * the bottom of the stack.
     */

    //public void roll(){

        //roll(head);


    }
    private void roll(E p) {
        E t =p.next;

        //LinkedStack<E> rollstack = new LinkedStack();
        //LinkedStack<E> rollstack2 = new LinkedStack();
        //LinkedStack<E> tmp = new LinkedStack();
        //E tempp=top.next;
        //if (tempp==null){
          //  return top;
        //}
        //else if (tempp!=null)&&(tempp.next==null){
          //  bottom=tempp;
            
            //rollstack2.push(rollstack.pop());
            
            //rollstack2.push(rollstack.pop());
        if(p.next= null){
            return;
        }

        p.next = p.next.next;
        t.next = p;
        roll(t.next);
        }
        //if(swwitch = 0){
            //swwitch = 1;
           // E toBePutToTheButtom = rollstack.pop();

        //}
        //else{
            //tmp=tmp.next;
            //bottom=tmp;
            //E toBePutToTheButtom = rollstack.pop();
            //rollstack2.push(top);
           // while(rollstack.empty!=false){
                //tmp.push(rollstack.pop());
                //roll();
                //rollstack.push(tmp.pop());



           // }
        //}


	//throw new UnsupportedOperationException("IMPLEMENT THIS METHOD");


    /** Removes the botttom element. The element is inserted on the
     * top of the stack.
     */

    //private void unroll() {
      //  LinkedStack<E> rollstack = new LinkedStack();
      //  LinkedStack<E> rollstack2 = new LinkedStack();
      //  LinkedStack<E> tmp = new LinkedStack();
      //  E saved;
      //  if (tmp==null){
           // return top;
       // }
       // else if (tmp!=null)&&(tmp.next==null){
           // bottom=tmp;
           // rollstack.pop(top);
           // rollstack2.push(top)
          //  rollstack.pop(bottom);
          //  rollstack2.push(bottom);

	//throw new UnsupportedOperationException("IMPLEMENT THIS METHOD");
       // }
    //}
        
    /** Returns a string representation of the stack.
     *
     * @return a string representation
     */

    //public String toString() {
	//StringBuffer stackStr = new StringBuffer("{");

	//Elem<E> current = top;
	
	//while (current != null) {
	    //stackStr.append(current.value);
	    //if (current.next != null) {
		//stackStr.append(",");
	    //}
	    //current = current.next;
	//}
	//stackStr.append("}");

	//return stackStr.toString();
    //}
    
}