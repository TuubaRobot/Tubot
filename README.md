# Tuuba
机器人项目5.1版本

项目：Javen-tuuba
原始日期：20171113 mohuaiyuan

0.此项目 可以作为测试使用 ，可以作为 开发其他功能的基础项目

1.订制场景 可以在此项目的基础上进行订制；

2.目前最新的订制场景项目：动漫节--20171115

3.后续的订制场景 最好直接在 动漫节的项目上进行修改 

4.当前项目 舞蹈动作文件包的 下载、解压、修改配置文件 的功能都基本上完成了，测试完成了；
仅仅还有一个小问题： 在windows系统上直接打包，放到文件服务器，下载之后，在机器人中解压，若文件名称有中文汉字，则出现乱码。

=============================================================================================================================================================

记录日期：20171201 mohuaiyuan
1.目前最新的订制场景项目：中国残联精协--20171124 

2.音乐、故事 场景 添加动作，可暂停，继续之后仍然有动作，功能完成 ，测试完成。

3.针对 20171113版本中4 的问题，有一个解决方案：使用java代码 生成.zip文件 。使用此方案，解压之后的不会出现乱码，后续可以给java代码增加一个界面。

==============================================================================================================================================================

记录日期：20171204 mohuaiyuan
1.音乐、故事 场景中 增加 修改音量 功能

2.解决自身窜自身场景的问题

==============================================================================================================================================================

记录日期：20171208 mohuaiyuan
1.舞蹈场景 增加打断功能 
注：需要下位机软件支持舞蹈打断，需要舞蹈 设置一些舞蹈打断点

2.音乐、故事、舞蹈场景 增加语音播报 
eg:即将播放“XXX”  
“抱歉，这首歌我暂时不会唱，要不你换一首吧”

==============================================================================================================================================================

记录日期：20171212   5.1版本
1.版本号:1.0.0.0.1
2.增加异常自启动机制,异常捕获机制:adb pull /sdcard/crash/
3.增加自启动bridge-release.apk 通过adb实现无线连接
4.增加自动播报ip地址功能,该功能仅供测试使用

----------------------------------------------------------
记录日期：20171227 mohuaiyuan
1.修改一些 语音提示

-----------------------------------------------------------
记录日期：20180102 mohuaiyuan
1.休眠  
功能完成，测试完成 ，包括直立休眠、坐下休眠、躺下休眠；
其中 语音唤醒 部分需要与杰文的代码合并





