interface Node<T> {
    value: T,
    next?: Node<T>
}

export default class Queue<T> {
    public length: number;
    private head? : Node<T>;
    private tail? : Node<T>;

    constructor() {
        this.head = this.tail = undefined;
        this.length =0;
    }

    enqueue(item: T): void { // adding to queue
        
        const node ={value:item} as Node<T> // tells the compiler to treat the object as an instance of the Node<T>
       this.length++;
        if (!this.tail){ // means if no element in queue
            this.tail = this.head = node;
            return
        }
        this.tail.next = node;
        this.tail = node;

}
    deque(): T | undefined { // removing from queue

        if(!this.head){
            return undefined
        }
        this.length--;
        
        const head = this.head;
        this.head = this.head.next;

        head.next = undefined // we dont need to do this in ts as it has garbage collection but still might required in languages like c

        if(this.length ===0){
            this.tail = undefined;
        }

        console.log(head.value,"is removed")
        return head.value;

}

    peek(): T | undefined { // get the first item in queue

    return this.head?.value;

}

}

