
class RandomKey {
  package {'random-key':
    ensure   => present,
    provider => dpkg,
    source   => "puppet:///modules/random-key/dpkg/random-key_1.0.0.deb",
  }

  file {'random-key.conf':
    path     => '/etc/default/random-key/random-key.conf',
    ensure   => file,
    source   => puppet:///modules/random-key/etc/random-key.conf
    mode     => 0644,
    require  => Package['random-key'],
    notify   => Service['random-key'],
  }

  service {'random-key':
    ensure   => true,
    enable   => true,
    start    => '/etc/init.d/random-key start',
    stop     => '/etc/init.d/random-key stop',
    restart  => '/etc/init.d/random-key restart',
  }
}
