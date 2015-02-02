AIDLDemo
========
#### .AIDService
> 1.write a library project "Common" <br>
> 2.write a "aidl" file, and two parcelable aidl file, which are "Request" and "Response" <br>
> 3.These two class must implements parcelable interface <br>
> 4.write a project called "Service", this project depends on the previous library project "Common". and implements the aidl interface <br>
> 5.write a project called "Client", this project also depends on the previous library project "Common". and call the service writen in project "Service" <br>
> 6.These two project all depend on the library project, the goal is that makes the code simple, or there will be two similar aidl file in both of them <br>
> 7.Write c file and Android.mk file <br>
> 8.use the NDK tool to compile them <br>
> 9.run service, and run client <br>
> 10.done! <br>
