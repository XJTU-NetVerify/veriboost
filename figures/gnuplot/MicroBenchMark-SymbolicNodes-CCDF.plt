set terminal pdfcairo font "Times New Roman,10" linewidth 1 rounded fontscale 1.35 size 26cm, 6.2cm

set style line 80 lt rgb "#808080"
set style line 81 lt 0 # dashed
set style line 81 lt rgb "#808080" # grey
set border 3 back linestyle 80
set grid back linestyle 81
set xtics nomirror
set ytics nomirror

set style line 1 lt rgb "#A00000" lw 1 pt 1 ps 1.5
set style line 2 lt rgb "#74c476" lw 1 pt 6 ps 1.5
set style line 3 lt rgb "#2b8cbe" lw 1 pt 2 ps 1.5
set style line 4 lt rgb "#00A000" lw 1 pt 9 ps 1.5
set style line 5 lt rgb "#253494" lw 1 pt 12 ps 1.5
set style line 6 lt rgb "#4F4F4F" lw 1

set mytics 10
set ylabel "CCDF (%)"
set xlabel "Reduction Ratio in Reduced Nodes" offset 0, 0.75
set yrange [0:100]
set ytics 20

set format y "%g%%"
set format x "%g%%"
set xrange [-10:110]
set xtic offset 0, 0.45
set offsets 5,5,0,0
set key width -0.05 Left vertical maxrows 1 reverse samplen 1 at screen 0.80, 0.94  font ',10' spacing 0.1
set bmargin screen 0.25
set tmargin at screen 0.85
set rmargin screen 0.94

set output 'results/MicroBenchMark-SymbolicNodes-CCDF.pdf'
set size 1, 0.9

stats 'data/MicroBenchMark-MaximumNumber-SymbolicNodes-CCDF.dat' using 1 nooutput
N = STATS_records

set multiplot layout 1,2 margins 0.12, 0.94, 0.27, 0.82 spacing 0.10

plot \
  '< sort -n -k3,3 data/MicroBenchMark-MaximumNumber-SymbolicNodes-CCDF.dat' using ($1*100):(100.*(N-($0+1)+1)/N) with lines ls 5 lw 5 dt 1 title 'Link Pruning'

unset ylabel
plot \
  '< sort -n -k3,3 data/MicroBenchMark-AverageNumber-SymbolicNodes-CCDF.dat' using ($1*100):(100.*(N-($0+1)+1)/N) with lines ls 5 lw 5 dt 1 title 'Link Pruning'