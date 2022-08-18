# Add a common override for all Rock Pi 4 machines
MACHINEOVERRIDES =. "rock-pi-4c-plus:"

require conf/machine/include/rk3399.inc

MACHINE_EXTRA_RRECOMMENDS += "kernel-modules"
