function Cat(name, color) {
    var self = this;

    self.name = name;
    self.color = color;
    self.sayHello = function () {
        console.log('Hi, I am ' + self.name + ' colored ' + self.color);
    };

    self.brother = {
        name: 'Mruczek',
        sayHello: function () {
            console.log('Hi, I am ' + this.name + ' and my brother is ' + self.name);
        }
    };
}

var filemon = new Cat('Filemon', 'black');
filemon.sayHello();
// Hi, I am Filemon colored black

filemon.brother.sayHello()
// Hi, I am Mruczek and my brother is Filemon


