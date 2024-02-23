Репозиторий для контроля изучения языка Java 

Изученная информация:

ООП
Три принципа:
1) Инкапсуляция
2) Полиморфизм
3) Наследование

Программа может быть организована одним из двух способов:
вокруг своего кода( что происходит, вокруг того,что происходит) 
или вокруг своих данных(на что производится воздействие).

Объектно-ориентированные программы организованы вокруг данных, и ключевой принцип выглядит как "данные, управляющие
доступом к коду".

В объектно-ориентированном языке определяются данные и подпрограммы, которым разерешено работать с этими данными.
Таким образом, тип данных точно определяет, какие операции можно применять к данным.

Инкапсуляция представляет собой механизм программирования, связывающий воедино код и данные, которыми он манипулирет,
и защищающий их от внешнего вмешательства и неправильного использования.  

В объектно-ориеннтированном языке код и данные могут быть связаны вместе так,
что создается автономный чёрный ящик, внутри которого находятся все необходимые данные и код. 

Когда код и данные связаны друг с другом подобным образом, создается объект. 

Другими словами объект - это способ поддержки инкапсуляции.

Внутри объекта код, данные либо то и другое могут быть закрытми или открытми по отношению к этому объекту.

Закрытый код или данные известны и доступными только остальным частям объекта,

т.е. к ним не могут обращаться части программы, существующие вне объекта. 

Как правило, открытые части объекта используются для обеспечения управляемого интерфейса к закрытым элементам объекта.

Базовой единицей инкапсуляции Java является КЛАСС. Класс определяет форму объекта. 

 В нем указаны как данные так и код, который будет работать с этими данными. 
Спецификация класса применяется в Java для создания объектов.

Объекты представляют собой экземпляры класса. По сути, класс - это набор "чертежей", которые указывают как строить объект.

Код и данные, образующие класс, называются членами класса. В частности данные, определенные классом, называются переменными-членами или переменными экземпляра. Код работающий с такими данными называется методами-членами или просто методами. Метод - это термин Java для подпрограммы.

Полиморфизм - представляет собой средство, которое позволяет с помощью одного интерфейса получать доступ к общему классу действий.

Конкретное действие определяется природой ситуации. Возьмем в качестве примера стек (т.е. список, работающий по принципу “последним пришел — первым обслужен”). 

У вас может быть программа, требующая стеки трех типов. Один стек используется для целых значений, другой — для значений с плавающей точкой и третий — для символов. Каждый стек реализуется по тому же самому алгоритму, даже если хранящиеся данные различаются. 

В языке, не являющемся объектно-ориентированным, вам придется создать три разных набора стековых процедур с отличающимися именами. 

Но благодаря полиморфизму в Java вы можете указать один общий набор стековых процедур, которые будут функционировать во всех трех конкретных ситуациях.

Разобравшись, каким образом работать с одним стеком, можно будет иметь дело со всеми тремя.

	Наследование - представляет собой процесс, посредством которого один объект приобретает свойства другого объекта. Например, яблоко сорта "Ред делишес" относится к классу
"Яблоко",который относится к классу "фрукт", а тот - к более крупному классу "Пища". Т.е. класс "пища" обладает определенными качествами(съедобноость, питательность и т.д.), 
которые по логике вещей применимы и к его подклассу "Фрукт". 

В дополнение к таким качествам класс "фрукт" имеет специфические характеристики (сочный сладкий и т.п.), которые отличают его от другой 
пищи.

Класс "яблоко" определяет качества, которые свойственны яблоку(растет на дереве, не является тропическим и т.д.).

В свою очередь яблоко сорта “Ред делишес”  наследует все качества всех предшествующих классов и определяет только те качества, которые делают его уникальным.

Без иерархий подобного рода каждый объект должен был бы явно определять все свои характеристики. Благодаря использованию наследования объект  должен определить только те качества, которые делают его уникальным в пределах своего класса.

Он может наследовать свои общие атрибуты от родителя.

Таким образом, именно механизм наследования позволяет одному объекту быть конкретным экземпляром более общего случая.

Типы данных:
INT - целочисленные значения;

Float и Double - дробные одинарная и двойная точность значения;

Цикл for

За счет создания цикла можно многократно выполнять кодовую последовательность. Циклы применяются всякий раз, когда нужно выполнить повторяющуюся задачу, потому что реализовать их гораздо легче, чем многократно записывать одну и ту же последовательность операторов. 

Язык Java поддерживает мощный набор конструкций циклов. Здесь мы рассмотрим цикл for, который имеет следующий вид:
for { инициализация; условие; итерация ) оператор;

В своей самой распространенной форме часть инициализация цикла устанавливает переменную управления циклом в начальное значение.

Часть условие представляет собой булевское выражение, которое проверяет переменную управления циклом.

Если результат проверки оказывается истинным, тогда оператор выполняется, а цикл for продолжает работу.

При ложном результате проверки цикл завершается. 

Выражение итерация определяет, каким образом переменная управления циклом изменяется на каждой итерации цикла. 
 
