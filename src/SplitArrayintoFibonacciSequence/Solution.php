<?php

namespace SplitArrayintoFibonacciSequence;

class Solution {

    private string $num = '';
    private array $result = [];

    function splitIntoFibonacci($num): array
    {
        $this->num = $num;

        for ($i = strlen($num) - 1; $i > 1; $i--) {
            $value = substr($num, $i);

            if ($value >= 2147483648) {
                break;
            }
            $this->result[] = $value;
            if ($this->compareNumber($value, $i)) {
                break;
            }
            array_splice($this->result, -1);
        }

        return array_reverse($this->result);
    }

    private function compareNumber(int $value, int $index): bool
    {
        if ($index < 0) {
            return true;
        }

        $valueLength = strlen($value);
        for ($i = 1; $i <= $valueLength; $i++) {
            $second = (int) substr($this->num, $index - $i, $i);
            if ($second > 0 && str_starts_with($second, 0) || $second >= 2147483648) {
                continue;
            }
            for ($j = 1; $j <= $valueLength; $j++) {
                $first = (int) substr($this->num, $index - $i - $j, $j);
                if ($first > 0 && str_starts_with($first, 0) || $first >= 2147483648) {
                    continue;
                }

                if ($first + $second === $value) {
                    $this->result[] = $second;
                    if ($index - $i - $j === 0) {
                        $this->result[] = $first;
                        return true;
                    }
                    if ($this->compareNumber($second, $index - $i)) {
                        return true;
                    }
                    array_splice($this->result, -1);
                }
            }
        }

        return false;
    }
}