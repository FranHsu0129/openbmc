SUMMARY = "Phosphor User Manager Daemon"
DESCRIPTION = "Daemon that does user management"
HOMEPAGE = "http://github.com/openbmc/phosphor-user-manager"
PR = "r1"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e3fc50a88d0a364313df4b21ef20c29e"
inherit autotools pkgconfig
inherit obmc-phosphor-dbus-service

DEPENDS += "autoconf-archive-native"
DEPENDS += "sdbusplus"
DEPENDS += "phosphor-logging"
DEPENDS += "phosphor-dbus-interfaces"
RDEPENDS_${PN} += "libsystemd"
RDEPENDS_${PN} += "phosphor-logging"


DBUS_SERVICE_${PN} += "xyz.openbmc_project.User.Manager.service"

SRC_URI += "git://github.com/openbmc/phosphor-user-manager"
SRCREV = "3c166b39a5f5737de57b4543cddc3f0700e88d63"
S = "${WORKDIR}/git"
