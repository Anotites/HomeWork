Задание 1.1 выполнено в классе Person.
Задание 1.2 выполнено в классе Animal.
Методы для генерации значения для имён созданы в классе Generator:
	2.1 Генерировать рандомную строку (не важно из чего состоит) - randomDiffForNameAndNickAndPersonNick().
	2.2 Генерировать рандомную строку (состоящую из русских букв) - randomDiffRusForNameAndNick().
	2.3 Генерировать рандомное имя (настоящее имя) - randomName().
	2.4* Генерировать рандомное имя (имена получать из файла) - randomNameFromFile().
Методы для генерации значения для кличек созданы в классе Generator:
	3.1 Генерировать рандомную строку (не важно из чего состоит) - randomDiffForNameAndNickAndPersonNick().
	3.2 Генерировать рандомную строку (состоящую из русских букв) - randomDiffRusForNameAndNick().
	3.3 Генерировать рандомное имя (настоящие клички животных) - randomNickForAnimal().
	3.4* Генерировать рандомное имя (клички получать из файла) - randomNickForAnimalFromFile().
Методы для генерации значения для псевдонимов созданы в классе Generator:
	4.1 Генерировать рандомную строку (не важно из чего состоит) - randomDiffForNameAndNickAndPersonNick().
	4.2 Генерировать рандомную строку (состоящую из анлийских букв) - randomDiffEngForPersonNick().
	4.3* Генерировать рандомное имя (псевдонимы получать из файла) - randomPersonNickFromFile().
Созданы классы с компараторами для класса, которые сравнивают:
	5.1. Длину пароля пользователей - ComparatorPasswordLength (и ComparatorPasswordLengthClassic для TreeSet с использованием стандартного Comparator)
	5.2. Длину пароля пользователей и псевдонимы пользователей по алфавиту - ComparatorPasswordLengthAndNick (и ComparatorPasswordLengthAndNickClassic для TreeSet с использованием стандартного Comparator)
	5.3. Возраст животных - ComparatorAge
	5.4. Возраст животных и клички животных по алфавиту - ComparatorAgeAndNick 
6.0 выполнено в DataContainer для Person и реализация класса в NewMain (как пример, для Animal все шаги ниже были бы такими же).
6.1 и 6.2 выполнено в DataContainer (метод myFill(int count)) и реализация метода в NewMain.
6.3.1 (сортировка встроенными средствами jdk) реализовано в NewMain.
6.3.2 (сортировка собственным методом сортировки) выполнено в DataContainer (метод mySort(Comparator<Person> comparator)) и реализация метода в NewMain.
6.4.1 Время заполнения коллекции - выполнено в NewMain.
6.4.2 Время итерирования коллекции - выполнено в NewMain (6.4.2.1. При помощи iterator и 6.4.2.2. При помощи while).
6.4.3 Время удаления всех элементов коллекции (метод delete()) - выполнено в NewMain.

Файлы для 2.4, 3.4, 5.4 сохранены в папке src\additional\collectionsы в IdeaProjects\JD1\HomeWork.

Все тесты для методов этого пакета выполнены в пакете home_work_4.additional.collections.