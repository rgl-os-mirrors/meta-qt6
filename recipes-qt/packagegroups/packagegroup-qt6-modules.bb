DESCRIPTION = "Qt6 modules"
LICENSE = "MIT"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

PACKAGEGROUP_DISABLE_COMPLEMENTARY = "1"

RDEPENDS_${PN} += " \
    ${@bb.utils.contains('DISTRO_FEATURES', 'opengl', 'qt3d', '', d)} \
    qt5compat \
    qtbase \
    qtcoap \
    qtconnectivity \
    qtdeclarative \
    ${@bb.utils.contains('DISTRO_FEATURES', 'opengl', 'qtgraphicaleffects', '', d)} \
    qtimageformats \
    qtmqtt \
    qtnetworkauth \
    qtopcua \
    ${@bb.utils.contains('DISTRO_FEATURES', 'opengl', 'qtquick3d', '', d)} \
    qtquickcontrols2 \
    qtquicktimeline \
    qtremoteobjects \
    qtserialbus \
    qtserialport \
    qtshadertools \
    qtspeech \
    qtsvg \
    qttools \
    qttranslations \
    qtvirtualkeyboard \
    ${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'qtwayland', '', d)} \
    qtwebchannel \
    qtwebsockets \
"
