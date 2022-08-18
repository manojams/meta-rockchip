SECTION = "kernel"
DESCRIPTION = "Mainline kernel"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

require recipes-kernel/linux/linux-yocto.inc

KBRANCH ?= "rock-4c-plus"

inherit kernel

SRC_URI = "git://git@github.com/openedev/kernel.git;branch=rock-4c-plus;protocol=ssh"

SRCREV = "e1e67e35543206c77b4bb332451f8bf6fcad8953"

S = "${WORKDIR}/git"
B = "${WORKDIR}/build"

DEPENDS += "openssl-native util-linux-native"
