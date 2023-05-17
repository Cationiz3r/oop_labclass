# Lab03 report

## Exercises questions

> Try to add a method addDigitalVideoDisc which allows to pass an arbitrary
> number of arguments for dvd. Compare to an array parameter. What do you
> prefer in this case?

I prefer passing an abitrary number of arguments, because that way,
an array doesn't need to be initialized (the DVDs can be passed in direcly).

> Is JAVA a Pass by Value or a Pass by Reference programming language?

Java is a pass-by-value programming language.

> After the call of swap(jungleDVD, cinderellaDVD) why does the title of
> these two objects still remain?

That's because the values of the pointers to those objects are passed as new
local variables to the `swap` method, and only the local variables inside the
method changes.

> After the call of changeTitle(jungleDVD, cinderellaDVD.getTitle()) why
> is the title of the JungleDVD changed?

The `title` attribute is modified through the value of the pointer copied into
the function.

> Write a toString() method for the DigitalVideoDisc class. What should be
> the return type of this method?

It should return a `String` object.
