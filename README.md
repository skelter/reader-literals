Discussion of Reader Literals in Clojure
=========================

Austin Clojure Meetup

Hosted by Capital Factory

Monday, February 4th, 2013

Presenter: Steve Suehs, Principal Engineer, Datical  

!

The Reader
========
* Parses stream -> Data

which also gives us

* Parses stream -> Code

!

Reader Literals
==========

```clojure
    #foo/bar form
    #foo/bar [1 2 3]
```

* magic sequence that the reader will map to a function and invoke
  * namespaced with slash
  * root space reserved for Clojure
* reader will pass next form to that function
* allows extension of reader without allowing change of the language
   * contrasts with other LISP's reader extensions, which could change semantics

! 

Reader Literals (cont'd)
--------------------

```clojure
    #foo/bar [1 2 3]
    
    #nascan/file "archives/2012/myblog.zip"
    #nascan/file { :path "archives/2012/myblog.zip" 
                       :size 12345678
                       :scantime  223048}
    #nas.File {...} ;; note no slash! while a reader literal, 
                     ;; used by Clojure for objects and classes.
```


!

Why?
====
S expressions are so powerful, why not use functions?

The difference is subtle but important.  With the reader literals we can
represent a data object and not rely on executable code, which means
we can use it to operate with other systems or map to other
implementations in a different context. 

The reader literals also mean we can change the function that the
reader will call with the next form.

The date-time instance is a good example of both.

!

Reader Literals has roots in EDN
======================
or maybe the other way around.

* EDN = Extensible Data Notation
* Used by Clojure and Datomic
* Intended to be used by other languages
* Looks like it is extracted from Clojure

If you took the programming out of Clojure and just left the data
parts, it would look like EDN.

!

Default Data Readers
===============
```clojure
    user=> default-data-readers
    {inst #'clojure.instant/read-instant-date, 
	 uuid #'clojure.uuid/default-uuid-reader}
```

!

Let us Code
=========

Fire up a repl and play.

!

nastimer example
---------------
I was having a problem with a disk usage program and my home NAS
so I played around with literals.

* If the data_readers.clj exists, it must have at least an empty map,
  or reader will fail, and repl may not start.

!

Possible Pitfalls
===========

Clojure searches for data_readers.clj at the "root of the classpath".

I suspect this will be perilous, but time will tell.

Counter examples:

* hibernate configuration pain
* memcache configuration pain
* singletons not 

Worth digging into the reader internals and proposing a solution.

This Presentation on Github
===================

*  origin	git@github.com:skelter/reader-literals.git (fetch)
*  Slides http://skelter.github.com/reader-literals/Presenter.html

!

Research Links
==========

* www.infoq.com/interviews/hickey-clojure-reader
* http://clojure.org/reader
* edn - a data transfer format https://github.com/edn-format/edn
* S expressions vs. XML as data storage/txfer
   * http://nuclight.ipfw.ru/vadim/ProgLanguageComparison/xml-sexprs.html
   * http://c2.com/cgi/wiki?XmlIsaPoorCopyOfEssExpressions
   * http://rwmj.wordpress.com/2009/10/30/xml-or-s-expressions/
   * http://blog.fandle.com/2010/02/using-s-expressions-instead-of-xml.html
   * http://www.paulgraham.com/diff.html
* Malcom Sparks example
   http://blog.malcolmsparks.com/?p=67

!

Presentation Tools
=============
* https://github.com/chrishulbert/MarkdownPresenter

