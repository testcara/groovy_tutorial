## 安装Groovy
虽然官方[下载页](http://www.groovy-lang.org/download.html)提供了下载指导，但由于我常用的操作系统为Centos，所以，让我们基于网友的[经验分享](https://itekblog.com/centos-groovy-installation-tutorial-newbs-centos-6-x/)来总结如何在Centos6/7安装Groovy。
### 前提条件
安装Groovy，我们必须安装JDK。
### 安装Groovy
在Centos上安装groovy，有以下几种方法：
- GVM
最简单的方法就是使用GVM。GVM是在绝大多数Unix系统上管理多版本软件开发包的最常用的工具。GVM提供了非常便捷的命令行接口去安装，切换，删除，查看软件版本。
则GVM安装的步骤为：
    ```
    curl https://raw.githubusercontent.com/moovweb/gvm/master/binscripts/gvm-installer > gem_install.sh
    chmod +x gem_install.sh & ./gem_install.sh
    source /root/.gvm/scripts/gvm
    gvm install groovy 
    ```
- 手动安装groovy
    ```
    cd /user && mkdir groovy
    # 在http://dl.bintray.com/groovy/maven/页面挑选自己向下载的版本
    wget http://dl.bintray.com/groovy/maven/apache-groovy-binary-2.5.0.zip
    unzip apache-groovy-binary-2.5.0.zip
    rm -rf apache-groovy-binary-2.5.0.zip 
    ln -s groovy-2.5.0/ ./latest
    # 在~/.bash_profile文件中添加如下两行
    export GROOVY_HOME=/usr/groovy/latest
    export PATH=$PATH:$GROOVY_HOME/bin
    source ~/.bash_profile
    # 则进行测试groovy安装完成
    groovy -e 'println("Hello, world")'
    ```
