// Method 1: using interface
// interface Course {
//     name: string;
//     duration: number;
//     price: number
// }
// Method 2: using type keyword
type Course = {
    name: string;
    duration: number;
    price: number
}

const html: Course = {name: "HTML", duration: 2, price: 1234};

const frontend: Course[] = [
    {name: "HTML", duration: 2, price: 1234},
    {name: "CSS", duration: 1, price: 234},
    {name: "JS", duration: 2, price: 4556}
]

console.log(html)
console.log(frontend)