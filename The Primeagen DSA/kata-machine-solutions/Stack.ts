interface Node<T>{
    value:T,
    prev:Node<T>
}

export default class Stack<T> {
    public length: number;
    private top? : Node<T>;

    constructor() {
        this.top = undefined;
        this.length = 0;

    }

    push(item: T): void {
        const node = {value:item} as Node<T>
            this.length++;
        if(!this.top){
            this.top = node;
            return
        }
            node.prev = this.top;
            this.top = node;
}
    pop(): T | undefined {

            this.length = Math.max(0,this.length-1) // decrement length, at max till 0
        
            if (this.length ===0){
                const top = this.top
                this.top = undefined
                return top?.value
            }

            const top = this.top as Node<T>
            this.top = top.prev 

            return top.value

}
    peek(): T | undefined {

        return this.top?.value;

}
}

