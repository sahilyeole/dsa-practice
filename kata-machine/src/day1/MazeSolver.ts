type Point = {
    x: number,
    y: number
}

const dir = [[-1,0],[1,0],[0,-1],[0,1]] // directions, top, left, bottom, right

function walk (maze: string[], wall: string, curr: Point, end:Point, seen:boolean[][],path:Point[]):boolean{
    // base cases
    // 1. off the map
    if (curr.x<0 || curr.x >= maze[0].length || // row length
        curr.y<0 || curr.y >= maze.length // no. of columns
       ) {
           return false
       }

    // 2. on a wall 
    if (maze[curr.y][curr.x] === wall){
        return false
    }

    // 3. on end postion
   if (curr.x == end.x && curr.y === end.y){
       path.push(end)
       return true
   } 

   // 4.have we seen it 
   if(seen[curr.y][curr.x]){
       return false
   }

   //recurse cases
   //1. pre 
   seen[curr.y][curr.x] = true
   path.push(curr)

   //2. recurse
   for(let i =0; i<dir.length;i++) {
       const [X,Y] = dir[i]
       if(walk(maze,wall,{
           x: curr.x + X,
           y: curr.y + Y
       },
         end,seen,path  )){
             return true
         }
   }

   // 3. post
   path.pop()

   return false
}

export default function solve(maze: string[], wall: string, start: Point, end: Point): Point[] {

    const seen : boolean[][] = []
    const path : Point[] = []

    for(let i =0; i< maze.length; i++){
        seen.push(new Array(maze[0].length).fill(false))
    }

    walk(maze,wall,start,end,seen,path)
    return path

}
