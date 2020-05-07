// if ~ else
// if ~ else if ~ else
// JAVA, C 언어와 구조 동일

a = 100;

if(a + 1 > 100) {    
    let a = 10;
    console.log('if 안의 a 값은', a)
}

// 조건식에서 참 거진 판정시!

// Falsy 로 평가될때!
// false, 0, '', null, undefined, NaN   <-- 'Falsy 한 값'이라 한다

// Truthy 로 평가될때
// true, 37, 'Mark', {}, []   <-- 'Truthy 한 값' 이라 한다

function print(data){
    if(data){
        console.log(data, typeof data, '-- Truthy');
    } else {
        console.log(data, typeof data, '-- Falsy');
    }
}

print(true)
print(false)
print(100)

print(); // 호출시 전달인자 없으면 undefined 값으로 동작함.


// !(not) 사용 가능
console.log()
console.log(!undefined)
console.log(!null);

// 삼항연산자 사용가능
let value = {'a' : 100}
let isTrue = value = value ? true : false;
console.log('isTrue =', isTrue, typeof isTrue);

// !! 사용하면 가능
isTrue = !!value;
console.log('isTrue =', isTrue, typeof isTrue);

console.log()

function printName(person){
    if (!person) return;
    //if(person === undefined || person === null) return;
    console.log('이름은', person.name)
}

let myBrother = {name : "John"}

printName(myBrother)

// printName() // undefined 값이 person에 넘겨지면서 .name 에서 error







