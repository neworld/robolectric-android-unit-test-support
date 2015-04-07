A sample Android app which shows how to use and run [Robolectric](http://robolectric.org/)
using [Android Unit Testing Support](http://tools.android.com/tech-docs/unit-testing-support)

Don't forget enable [Experimental Unit Testing support](http://tools.android.com/_/rsrc/1423155661989/tech-docs/unit-testing-support/fveMJjOBb2.png?height=87&width=1200)

Debugging tests
===============

You can use the parameter `debugger` to run the tests in debug mode. Example:

 0. Add some breakpoints.
 1. First you need to enable debug mode `./gradlew -Pdebugger=true` 
 2. Wait until tests will be ready and gradle waits for debugger.
 3. Make sure you have [remote debug](https://cloud.githubusercontent.com/assets/38703/5818871/bb6e146a-a0c1-11e4-8f73-49616e707c8f.png) configuration on 5005 port.
 4. Start debugging: ![image](https://cloud.githubusercontent.com/assets/38703/5818885/db4846ac-a0c1-11e4-9186-61e32948a21c.png)

You should be able to debug your tests!

To Do
====

  - [x] ~~Avoid creating MyTestRunner to configure properties~~

License
=======

```
Copyright 2015 NeWorld

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```